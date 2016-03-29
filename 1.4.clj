(defn a-plus-abs-b [a b]
  ((if (pos? b) + -) a b))

(assert (= (a-plus-abs-b 4 3) 7))
(assert (= (a-plus-abs-b 4 -3) 7))

;; Function a-plus-abs-b accepts 2 arguments.
;; If b is positive the function sums the arguments.
;; If b is negative the function subtracts b from a.
;; Subtracting a negative number equals to addition
;; its module.
