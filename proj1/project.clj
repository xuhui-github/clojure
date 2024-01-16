(defproject proj1 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [mysql/mysql-connector-java "5.1.44"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.clojure/core.match "0.3.0-alpha4"]
                 [revise "0.0.6"]]
  :repl-options {:init-ns proj1.core}
  :main proj1.core/-main)
