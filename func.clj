;(defn function-name
   ;;([arg1] body-executed-for-one-argument-acll)
   ;;([arg1 arg2] body executed-for-two-argument-call)
   ;;more case may follow
   ;;)

(defn total-cost
  ([item-cost number-of-items]
   (* item-cost number-of-items))
  ([item-cost]
   (total-cost item-cost 1)))

(total-cost 10  23)
(total-cost 199)

(defn total-all-numbers [& numbers]
  (apply + numbers))

(total-all-numbers 1 2 3 4 5)

(defn many-arities
  ([] 0)
  ([a] 1)
  ([a b c] 3)
  ([a b c & more] "variadic"))

(many-arities)
(many-arities 2)
(many-arities 1 2 3 4)


(defn count-down [n]
  (when-not (zero? n)
    (when (zero? (rem n 100))
      (println "count-down:" n))
    (count-down (dec n))))
;;(count-down 100000)

(defn count-downr [n]
  (when-not (zero? n)
    (if (zero? (rem n 100))
      (println "count-down:" n))
    (recur (dec n))))
;;(count-downr 100000)


(declare hatt)
(defn catt [n]
  (when-not (zero? n)
    (when (zero? (rem n 100))
      (println "catt:" n))
    (fn [] (hatt (dec n)))))
(defn hatt [n]
  (when-not (zero? n)
    (when (zero? (rem n 100))
      (println "hatt:" n))
    (fn [] (catt (dec n)))))
(trampoline hatt 100000)
