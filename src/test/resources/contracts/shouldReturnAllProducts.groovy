import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name "should_return_all_products"
    description "should return all products"
    request {
        method 'GET'
        url '/products'
    }
    response {
        status 200
        body("""[
                {
                    "id": 1,
                    "name": "apple",
                    "price": 2.5,
                    "unit": "pound",
                    "description": "This apple come from China"
                },
                {
                    "id": 2,
                    "name": "computer",
                    "price": 12000,
                    "unit": "one",
                    "description": "MI"
                }
        ]""")
    }
}