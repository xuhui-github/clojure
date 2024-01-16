(def state (atom {}))

(defn state-change [key atom old new]
  (prn (format "key: %s,old val: %s, new val %s" key old new))
  )

(add-watch state :foo state-change)
(swap! state assoc :bar "baz")
