(ns clojure.examples.example
   (:gen-class))
(defn Example []
   (def x (atom 0))
   (add-watch x :watcher
      (fn [key atom old-state new-state]
      (println "The value of the atom has been changed")
      (println "old-state" old-state)
      (println "new-state" new-state)))

(reset! x 2))
(Example)


