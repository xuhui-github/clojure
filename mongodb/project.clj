(defproject mongodb "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [eva-healthtech/mongo-driver-3 "0.6.1"]
                 [com.novemberain/monger "3.6.0"]
                 [congomongo "2.5.1"]]
  :repl-options {:init-ns mongodb.core}
  :main mongodb.core/main)
