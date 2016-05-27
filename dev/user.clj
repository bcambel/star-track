(ns user
  (:require [clojure.tools.namespace.repl :refer [refresh set-refresh-dirs]]
    [com.stuartsierra.component :as component]
    [star-tracker.core :refer :all]
    ))

(defn start
  []
  (def sys (component/start (app-system {:pipe "local" :port 9989})))
  )
