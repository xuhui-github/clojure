(def account (ref 1000))
(def secured (ref false))
(def started (promise))

(defn withdraw [account amount secured]
  (dosync
          (let [secured-value (ensure secured)]
            (deliver started true)
            (Thread/sleep 5000)
            (println :started)
            (when-not secured-value
              (alter account - amount))
            (println :finished))))
(future (withdraw account 500 secured))
(println @started)
(dosync (ref-set secured true))
