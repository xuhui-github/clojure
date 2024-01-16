(def a (atom 0))
(deref a)
@a 
(reset! a 100)
(+ @a @a)
a 
(reset! a (inc @a))
(swap! a inc)
