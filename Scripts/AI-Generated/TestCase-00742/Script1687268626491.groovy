import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-there-any-way-to-convert-current-automation-testing-which-code-with-android-xml-that-migrated-to-jetpack-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-there-any-way-to-convert-current-automation-testing-which-code-with-android-xml-that-migrated-to-jetpack-compose/80914/3')

'step 2: Add visual checkpoint at Page_t_is-there-any-way-to-convert-current-automation-testing-which-code-with-android-xml-that-migrated-to-jetpack-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00742_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
