(defn new-if [predicate then-clause else-clause]
  (cond predicate then-clause
        :else else-clause))

(assert (= (new-if (= 2 3) 0 5) 5))
(assert (= (new-if (= 1 1) 0 5) 0))

(defn sqrt-iter [guess x]
  (new-if (good-enough? guess x)
          guess
          (sqrt-iter (improve guess x)
                     x)))

(defn good-enough? [guess x] true)
(defn improve [guess x] guess)

(assert (sqrt-iter 2 4))

;; Lisa should see stack overflow error.
;; Because Lisp uses applicative order.
;; See details in 1.5.clj.
