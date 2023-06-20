import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_webinar-ltimindtree-driving-enterprise-automation-for-duck-creek-platform-using-katalon'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/webinar-ltimindtree-driving-enterprise-automation-for-duck-creek-platform-using-katalon/88500')

'step 2: Add visual checkpoint at Page_t_webinar-ltimindtree-driving-enterprise-automation-for-duck-creek-platform-using-katalon'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00384_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
