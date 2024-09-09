(defn cube [x]
  (* x x x))

(defn cube-all [numbers]
  (if (empty?  numbers)
    ()
    (cons (cube (first numbers))
          (cube-all (rest numbers)))))


(defn do-to-all [f numbers]
  (if (empty? numbers)
    ()
    (cons (f (first numbers))
          (do-to-all f (rest numbers)))))

(defn square [x]
  (* x x))

(do-to-all square [1 2 3 4 5 6])
(do-to-all cube [1 2 3 4 5 6])

