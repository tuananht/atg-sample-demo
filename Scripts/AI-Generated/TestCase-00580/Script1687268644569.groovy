import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_thank-you'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/badges/38/thank-you')

'step 2: Add visual checkpoint at Page_thank-you'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00580_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
