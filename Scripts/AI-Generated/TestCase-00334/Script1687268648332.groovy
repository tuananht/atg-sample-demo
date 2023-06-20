import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_nice-share'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/badges/21/nice-share')

'step 2: Add visual checkpoint at Page_nice-share'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00334_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
