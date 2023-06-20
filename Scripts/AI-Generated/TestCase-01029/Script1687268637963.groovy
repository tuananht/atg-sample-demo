import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_anniversary'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/badges/24/anniversary')

'step 2: Add visual checkpoint at Page_anniversary'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01029_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
