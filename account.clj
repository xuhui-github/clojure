
(def account-a (ref 10000))
(def account-b (ref 2000))

(defn mov [acc1 acc2 amount]
  (dosync
          (let [balance1 @acc1 
                balance2 @acc2]
            (println "Transaction started")
            ;;(clojure.core/deliver started true)
            (Thread/sleep 5000)
            (when (> balance1 amount)
              (alter acc1 - amount)
              (alter acc2 + amount))
            (println "Transaction finished"))))

(future (mov account-a account-b 50))
@started
(dosync (ref-set account-a 20))

(import java.util.ArrayList)
(def lst (new java.util.ArrayList))
(.size lst)
(.add lst "first")
(.add lst "second")
(println (.size lst))
(import java.util.LinkedList)
(new LinkedList)



