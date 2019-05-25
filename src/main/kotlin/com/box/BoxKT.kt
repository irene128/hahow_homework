package com.box

open class BoxKT {
    private var length: Float
    private var width: Float
    private var height: Int

    constructor(length: Float, width: Float, height: Int) {
        this.length = length
        this.width = width
        this.height = height
    }

    open fun validate(length: Float, width: Float, height: Int) = (this.length >= length && this.width >= width && this.height >= height)
}