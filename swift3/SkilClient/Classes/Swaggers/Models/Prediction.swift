//
// Prediction.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class Prediction: JSONEncodable {

    public var id: String?
    public var needsPreProcessing: Bool?
    public var prediction: INDArray?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["id"] = self.id
        nillableDictionary["needsPreProcessing"] = self.needsPreProcessing
        nillableDictionary["prediction"] = self.prediction?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

