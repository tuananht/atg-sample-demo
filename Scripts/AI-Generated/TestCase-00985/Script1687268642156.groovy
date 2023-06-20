import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-get-gmt-time-in-katalon'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-get-gmt-time-in-katalon/20249')

'step 2: Add visual checkpoint at Page_t_how-to-get-gmt-time-in-katalon'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00985_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
