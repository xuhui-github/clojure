(def abc  {:a 1 :b 2 :c 3})
(keys abc)
(vals abc)
(:a abc)
(:c abc)

(let [{value-a :a
       value-b :b
       value-c :c
       } abc]
  (str value-c
       value-b
       value-a))
(sort abc)
(let [ [a b c] (sort (vals abc))
      ab [ a b]
      bc [ b c]
      ca [ c a]]
  (let [xyz (sort  (vals abc))
        {[_ y z] :xyz} {:xyz xyz}]
    (format "Y = %s Z = %s" y z))

  (let [abc [:A :B :C]
        [a & bc] abc
        [_ _ c] abc]
    (format "A = %s BC = s C = %s" a bc c))

  
