//
// UserDeprecated.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** DEPRECATED (2/5/2018) -- This JSON object contains the BlueJeans&#39; user profile fields prior to MeetMe35. */

public struct UserDeprecated: Codable {

    /** Unique identifier for the user. */
    public var _id: Int?
    /** User&#39;s username */
    public var username: String?
    /** User&#39;s first name */
    public var firstName: String?
    /** User&#39;s middle name */
    public var middleName: String?
    /** User&#39;s last name */
    public var lastName: String?
    /** User&#39;s email address */
    public var emailId: String?
    /** User&#39;s company name */
    public var company: String?
    /** User&#39;s title */
    public var title: String?
    /** User&#39;s phone */
    public var phone: String?
    /** Path to user&#39;s profile picture */
    public var profilePicture: String?
    /** User&#39;s timezone */
    public var timezone: String?
    /** User&#39;s preference of 12 or 24 hour time display */
    public var timeFormat: Int?
    /** User&#39;s language code */
    public var language: String?

    public init(_id: Int?, username: String?, firstName: String?, middleName: String?, lastName: String?, emailId: String?, company: String?, title: String?, phone: String?, profilePicture: String?, timezone: String?, timeFormat: Int?, language: String?) {
        self._id = _id
        self.username = username
        self.firstName = firstName
        self.middleName = middleName
        self.lastName = lastName
        self.emailId = emailId
        self.company = company
        self.title = title
        self.phone = phone
        self.profilePicture = profilePicture
        self.timezone = timezone
        self.timeFormat = timeFormat
        self.language = language
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case username
        case firstName
        case middleName
        case lastName
        case emailId
        case company
        case title
        case phone
        case profilePicture
        case timezone
        case timeFormat
        case language
    }


}

