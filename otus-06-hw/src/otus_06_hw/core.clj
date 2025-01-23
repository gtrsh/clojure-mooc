(ns otus-06-hw.core)

(def test-db {:cust-table
              [{:id-cust 1, :name "John Smith", :address "123 Here Street", :phone-number "456-4567"}
               {:id-cust 2, :name "Sue Jones", :address "43 Rose Court Street", :phone-number "345-7867"}
               {:id-cust 3, :name "Fan Yuhong", :address "165 Happy Lane", :phone-number "345-4533"}],
              :prod-table
              [{:id-prod 1, :item-description "shoes", :unit-cost 14.96}
               {:id-prod 2, :item-description "milk", :unit-cost 1.98}
               {:id-prod 3, :item-description "jam", :unit-cost 2.99}
               {:id-prod 4, :item-description "gum", :unit-cost 1.25}
               {:id-prod 5, :item-description "eggs", :unit-cost 2.98}
               {:id-prod 6, :item-description "jacket", :unit-cost 42.99}],
              :sales-table
              [{:id-sales 1, :id-cust 1, :id-prod 1, :items-count 3}
               {:id-sales 2, :id-cust 2, :id-prod 2, :items-count 3}
               {:id-sales 3, :id-cust 2, :id-prod 1, :items-count 1}
               {:id-sales 4, :id-cust 3, :id-prod 3, :items-count 4}]})
