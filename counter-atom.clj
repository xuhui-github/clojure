(def counter (atom 0))

(set-validator! counter #(even? %))

(swap! counter inc)
(swap! counter #(+ 2 %))
(swap! counter inc)
(set-validator! counter nil)
;(swap! counter #(+2 %))

(swap! counter inc)

