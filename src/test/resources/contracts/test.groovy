import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name "should_return_200"
    request {
        method 'GET'
        url('/hello') {}
    }
    response {
        status 200
    }
}