//
// UserId.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct UserId: Codable {

    /** The ID of the user. */
    public var _id: Int?

    public init(_id: Int?) {
        self._id = _id
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
    }


}
