package base

import bookstore.Address
import grails.buildtestdata.UnitTestDataBuilder
import spock.lang.Specification

class MinSizeUnitTests extends Specification implements UnitTestDataBuilder {
    void setupSpec() {
        mockDomains(Address)
    }

    void testEmailMinSize() {
        when:
        def domainObject = build(Address)

        then:
        assert domainObject
        assert domainObject.id
        assert domainObject.emailAddress
        assert domainObject.emailAddress.size() == 40
    }

    void testUrlMinSize() {
        when:
        def domainObject = build(Address)

        then:
        assert domainObject
        assert domainObject.id
        assert domainObject.webSite
        assert domainObject.webSite.size() == 40
    }
}
