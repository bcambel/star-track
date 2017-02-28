(ns star-tracker.system.local
  (:require
      [cheshire.core                :refer :all]
      [clojure.core.async                     :as async :refer [alts! go chan]]
      [com.stuartsierra.component             :as component])
  )


(defrecord LocalFileProducer []
  component/Lifecycle
  (start [component]
    (let [producing-channel (chan 65532)]
    (go (while true
      (let [[[topic msg] ch] (alts! [producing-channel])]
        (spit "tracker.log" (str msg "\n") :append true))))
      (assoc component :channel producing-channel)
      )
    )

  (stop [component]
    (assoc component :channel nil)
    )
  )
