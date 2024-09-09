(defproject brepl-hello "0.1.0-SNAPSHOT"
:plugins [[lein-cljsbuild "0.2.7"]]
:dependencies [[org.clojure/clojure "1.4.0"]
[org.clojure/clojurescript "0.0-1450"]
[compojure "1.1.0"]
[ring/ring-jetty-adapter "1.1.1"]]
:source-paths ["src/clj"]
:cljsbuild {
:builds [{
:source-path "src/cljs"
:compiler {
:output-to "resources/public/brepl-hello.js"
:optimizations :whitespace
:pretty-print true}}]})
