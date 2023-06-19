import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_java-error-version-mismatch-in-jna-library'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/java-error-version-mismatch-in-jna-library/38670')

'step 2: Add visual checkpoint at Page_t_java-error-version-mismatch-in-jna-library'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00065_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
