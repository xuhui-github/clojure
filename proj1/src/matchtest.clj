(ns matchtest) 

(match [[:a :b :c]]
        [[:a :b _]] :success
        :else :fail
       )
;; :success

(match [{:a 1 :b 1}]
       [{:a _ :b 2}] :foo
       [{:a 1 :b _}] :bar
       :else :baz
       )

;;In the first example,we're passing through a vector data structure,and in the second we're passing a map.In both cases,we're able to find a match easily by utilizing the _ wildcard symbol to catch certain values we either don't care about or are unsure of what their values will be

(match [[:a 1 :b 2 :c 3 :d 4]]
        [[:a 1 :b 2]] "this would need to be complete match"
        [[:a 1 :b _ & rest ]]  "rest allows for a partial match" 
        :else :fail
         
       )


