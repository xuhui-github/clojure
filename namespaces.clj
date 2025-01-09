(ns joy.ch2)

(defn hello []
  (println "Hello Cleverland"))

(defn report-ns []
  (println "current package is" *ns*))
(ns joy.another)


(ns joy.yet-another)

(ns joy.req
  (:require clojure.set))

(clojure.set/intersection #{ 1 2 3} #{3 4 5})

(ns joy.req-alias
  (:require [clojure.set :as s]))
(s/intersection #{1 2 3} #{3 4 5})


