(defn square [x]
  (* x x))

(defn square-all [numbers]
  (if (empty? numbers)
    nil
    (cons (square (first numbers))
          (square-all (rest numbers)))))

(square-all '(1 2 3)) 
 