/**
 * Finnhub API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.finnhub.api.models

import io.finnhub.api.models.UsaSpending

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param symbol Symbol.
 * @param `data` Array of government's spending data points.
 */

data class UsaSpendingResult (

    /* Symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,

    /* Array of government's spending data points. */
    @Json(name = "data")
    val `data`: kotlin.collections.List<UsaSpending>? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}
