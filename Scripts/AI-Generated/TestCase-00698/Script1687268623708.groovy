import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-project-very-slow-to-open-on-startup-of-katalon-17'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-project-very-slow-to-open-on-startup-of-katalon-vpn/52918/17')

'step 2: Add visual checkpoint at Page_t_katalon-project-very-slow-to-open-on-startup-of-katalon-17'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00698_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
