(defprotocol P  
  (foo [x])
  (bar-me [x] [x y])
  )

(deftype Foo [a b c]
  P 
  (foo [x] a)
  (bar-me [x] b)
  (bar-me [x y] (+ c y))
  )

(bar-me (Foo. 1 2 3) 42)

(foo
  (let [x 42]
    (reify P 
           (foo [this] 17)
           (bar-me [this] x)
           (bar-me [this y] x)
           )
    )
  )

(extend AType
        AProtocol
        {:foo an-existing-fn
         :bar (fn [a b] ...)
         :baz (fn [a] ...) ([ a b] ...)...
         }
        BProtocol
        {...}
        ...
        )
(extend-type MyType
             Countable
             (cnt [c] ...)
             Foo
             (bar [x y] ...)
             (baz ([x] ...) [x y zs] ...)
             )

;Expands into:
(extend MyType
        Countable
        {:cnt (fn [c] ...)}
        Foo
        {:baz (fn ([x] ...) ([x y zs]...))
         :bar (fn [x y] ...)
         }
        )


