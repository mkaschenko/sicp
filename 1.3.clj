(defn square [x]
  (* x x))

(assert (= (square -3) 9))

(defn sum-of-squares [a b]
  (+ (square a) (square b)))

(assert (= (sum-of-squares 6 8) 100))

(defn sum-of-squares-of-two-max [a b c]
  (cond (and (> a c) (> b c)) (sum-of-squares a b)
        (and (> a b) (> c b)) (sum-of-squares a c)
        (and (>= b a) (>= c a)) (sum-of-squares b c))))

(assert (= (sum-of-squares-of-two-max 5 5 0) 50))
(assert (= (sum-of-squares-of-two-max 5 0 5) 50))
(assert (= (sum-of-squares-of-two-max 0 5 5) 50))
(assert (= (sum-of-squares-of-two-max 5 5 5) 50))
