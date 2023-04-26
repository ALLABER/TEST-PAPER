object Dependencies {
    val core by lazy { "androidx.core:core-ktx:${Versions.CORE}" }
    val appcompat by lazy { "androidx.appcompat:appcompat:${Versions.APPCOMPAT}" }
    val material by lazy { "com.google.android.material:material:${Versions.MATERIAL}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}" }
    val junit by lazy { "junit:junit:${Versions.JUNIT}" }
    val testJunit by lazy { "androidx.test.ext:junit:${Versions.TEST_JUNIT}" }
    val testEspresso by lazy { "androidx.test.espresso:espresso-core:${Versions.TEST_ESPRESSO}" }
}