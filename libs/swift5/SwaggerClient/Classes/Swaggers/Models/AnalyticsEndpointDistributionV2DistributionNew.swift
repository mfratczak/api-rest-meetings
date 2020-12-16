//
// AnalyticsEndpointDistributionV2DistributionNew.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct AnalyticsEndpointDistributionV2DistributionNew: Codable {

    /** Name of endpoint device type */
    public var endpointType: String?
    /** Count of the number of device engagements */
    public var count: Int?

    public init(endpointType: String?, count: Int?) {
        self.endpointType = endpointType
        self.count = count
    }

    public enum CodingKeys: String, CodingKey { 
        case endpointType = "endpoint_type"
        case count
    }


}

