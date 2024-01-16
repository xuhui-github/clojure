
(def my-addition (fn [ a b] (+ a b)))
(my-addition 100 200)
(println "Hello world")


(def x 1)
(cond 
      (> x 0) "greater"
      (= x 0) "zero"
      (< x 0) "leaser")

(def a-map {:a 1 :b 2 :c 4})
(def mylist (list 1 2 3 4 5))
(conj mylist "first")
(conj mylist "first","second","third")
#(conj (conj (conj (list 1 2 3) 4) 5) 6)


(peek (list 1 2 3))
(pop  (list 1 2 3))


(def list1 (list 1 2 3))
(count list1)
(count (list 1 2 3 4))

(def three-numbers '(1 2 3))
(count three-numbers)


(vector 10 20 30 40 50)
(def the-vector [ 10 20 30 40 50])
(get the-vector 0)
(get the-vector 1)
(get the-vector 10)

(conj the-vector 'last')
(peek [1 2 ])
(peek [])
(pop [])


(def the-map {:a 1 :b 2 :c 3})
(:b the-map)
(:z the-map "unknown value")

(def updated-map (assoc the-map :d 4))
updated-map

(dissoc updated-map :a)


(def users {:kyle {

                   :date-joined "2009-01-01"
                   :summary {
                             :average {
                                       :monthly 1000
                                       :yearly 12000}}}})
(println users)
(assoc-in users [:kyle :summary :average :monthly] 3000)
(print users)
(get-in users [:kyle :summary :average :monthly])
(update-in  users [:kyle :summary :average :monthly] + 500)

(first (list 1 2 3))
(rest (list 1 2 3))

(def a [ 1 2 3])
(vector? a)


(defn average-pets []
  (/ (apply + (map :numver-pets (vals users))) (count users)))

(defn average-pets []
  (let [user-data (vals users)
        pet-counts (map :number-pets user-data)
        total (apply + pet-counts)]
    (/ total (count users))))

(let [ x 1
      y 2
      z (+ x y)]
  z)


(defn average-pets []
  (let [user-data (vals users)
        pet-counts (map :number-pets user-data)
        value-from-println (println "Total pets:" pet-counts)
        total (apply + pet-counts)]
    (/ total (count users))))

(defn average-pets []
  (let [ user-data (vals users)
         pet-counts (map :number-pets user-data)
         _ (println "Total Pets:" pet-counts)
         total (apply + pet-counts)]
    (/ total (count users))))

(defn fact-loop [n]
  (loop [current n fact 1]
    (if (= current  1)
      fact
      (recur (dec current) (* fact current) ))))
(fact-loop 5)


(defn fact-loop-invalid [n]
  (loop [current n fact 1]
    (if (= current 1)
      fact
      (recur (dec current) (* fact current)))
    (println "Done ,current value:" current)))
(fact-loop-invalid 5) 

