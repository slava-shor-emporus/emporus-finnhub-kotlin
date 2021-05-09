/**
* Finnhub API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package io.finnhub.api.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

/**
 * 
 * @param accessNumber Access number.
 * @param symbol Symbol.
 * @param cik CIK.
 * @param year Year.
 * @param quarter Quarter.
 * @param form Form type.
 * @param startDate Period start date <code>%Y-%m-%d %H:%M:%S</code>.
 * @param endDate Period end date <code>%Y-%m-%d %H:%M:%S</code>.
 * @param filedDate Filed date <code>%Y-%m-%d %H:%M:%S</code>.
 * @param acceptedDate Accepted date <code>%Y-%m-%d %H:%M:%S</code>.
 * @param report 
 */

@Serializable
data class Report (
    /* Access number. */
    @SerialName("accessNumber")
    val accessNumber: String? = null,
    /* Symbol. */
    @SerialName("symbol")
    val symbol: String? = null,
    /* CIK. */
    @SerialName("cik")
    val cik: String? = null,
    /* Year. */
    @SerialName("year")
    val year: Long? = null,
    /* Quarter. */
    @SerialName("quarter")
    val quarter: Long? = null,
    /* Form type. */
    @SerialName("form")
    val form: String? = null,
    /* Period start date <code>%Y-%m-%d %H:%M:%S</code>. */
    @SerialName("startDate")
    val startDate: String? = null,
    /* Period end date <code>%Y-%m-%d %H:%M:%S</code>. */
    @SerialName("endDate")
    val endDate: String? = null,
    /* Filed date <code>%Y-%m-%d %H:%M:%S</code>. */
    @SerialName("filedDate")
    val filedDate: String? = null,
    /* Accepted date <code>%Y-%m-%d %H:%M:%S</code>. */
    @SerialName("acceptedDate")
    val acceptedDate: String? = null,
    @SerialName("report")
    val report: JsonObject? = null
) {
	companion object {
    }

}
