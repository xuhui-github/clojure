(defn total-cost [ item-cost number-of-item]
  (* item-cost number-of-item))

(def total-cost-repr (fn [ item-cost number-of-item]
                       (* item-cost number-of-item)))
(meta #'total-cost)
(meta #'total-cost-repr)
user/total-cost
