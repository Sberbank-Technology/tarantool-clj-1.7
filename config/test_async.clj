{:tarantool {:host "localhost"
             :port 3301
             :username "tester"
             :password "tester"
             :async? true}
 :tester-tuple-space 1
 :tester-space {:name "tester"
                :fields [:id :first-name :second-name]
                :tail :_tail}}
