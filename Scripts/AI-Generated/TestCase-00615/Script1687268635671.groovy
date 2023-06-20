import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_introduction-and-download-katalon'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/introduction-and-download-katalon/62044')

'step 2: Add visual checkpoint at Page_t_introduction-and-download-katalon'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00615_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
