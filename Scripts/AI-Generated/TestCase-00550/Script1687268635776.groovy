import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_read-and-write-gmail-36'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/read-and-write-gmail-messages/22543/36')

'step 2: Add visual checkpoint at Page_t_read-and-write-gmail-36'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00550_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
