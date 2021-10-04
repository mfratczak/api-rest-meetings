//
// MeetingEmailsProperty.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MeetingEmailsProperty: Codable {

    public var ICS: String?
    public var text: String?
    public var HTML: String?
    public var ICS_FILE: String?

    public init(ICS: String?, text: String?, HTML: String?, ICS_FILE: String?) {
        self.ICS = ICS
        self.text = text
        self.HTML = HTML
        self.ICS_FILE = ICS_FILE
    }

    public enum CodingKeys: String, CodingKey { 
        case ICS
        case text = "Text"
        case HTML
        case ICS_FILE
    }


}
