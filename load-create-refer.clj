(ns joy.ch2)
(defn hello []
  (print "hello"))
(defn report-ns []
  (print "The current package is " *ns*))


(ns joy.use-ex
  (:require [clojure.string :refer (capitalize)]))

(map capitalize ["kilgore" "trout"])



(ns joy.yet-another
  (:refer joy.ch2)
  (:refer clojure.set :rename {union onion}))

(report-ns)
(onion #{1 2} #{4 5})

(ns joy.java
  (:import [java.util HashMap]
           [java.util.concurrent.atomic AtomicLong]))
(HashMap. {"happy?" true})
(AtomicLong. 42)

