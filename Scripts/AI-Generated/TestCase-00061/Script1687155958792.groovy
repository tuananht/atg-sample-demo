import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_why-i-am-not-able-to-locate-the-element-of-email-with-id'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/why-i-am-not-able-to-locate-the-element-of-email-with-id/90706')

'step 2: Add visual checkpoint at Page_t_why-i-am-not-able-to-locate-the-element-of-email-with-id'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00061_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
