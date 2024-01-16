(def counter (atom 0))
(swap! counter #(+ 4 %))

@counter 
(compare-and-set! counter 4 0)

@counter
(compare-and-set! counter 4 1)

@counter

(compare-and-set! counter 0 10)
@counter
(compare-and-set! counter 10 1000)
@counter


