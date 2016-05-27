(defproject star-tracker "0.1.3.1"
  :description "Event collector"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.8.0"]
    [org.clojure/core.memoize "0.5.8"]
    [org.clojure/core.async "0.2.374"]
    [org.clojure/tools.cli "0.3.5"]
    [com.stuartsierra/component "0.3.1"]
    [compojure "1.5.0"]
    [ring "1.4.0"]
    [http-kit "2.1.19"]
    [com.taoensso/timbre "4.3.1" :exclusions [org.clojure/tools.reader]]
    [cheshire "5.6.1"]
    [midje "1.8.3"]
    [metrics-clojure "2.6.1"]
    [clj-kafka/clj-kafka "0.3.4"]
    [amazonica "0.3.57" :exclusions [com.taoensso/encore org.clojure/tools.reader com.taoensso/nippy]]
    [com.taoensso/nippy "2.7.0"]
    ]
  ; :java-agents [[com.newrelic.agent.java/newrelic-agent "3.28.0"]]
  ; :main star-tracker.core
  ; :uberjar-name "star-tracker.jar"
  :jvm-opts ["-Dlog4j.configuration=file:./log4j.properties"]
  :target-path "target/%s"
  :repl-options {
    :timeout 1200000
  }
  :profiles {:uberjar {:aot :all}
      :dev {:plugins [[lein-midje "3.1.3"]]
            :dependencies [[org.clojure./tools.namespace "0.2.11"]]
            :source-paths ["dev"]  }
    })
