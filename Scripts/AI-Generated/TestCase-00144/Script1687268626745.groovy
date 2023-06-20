import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_basic-report-plugin-is-not-visible-in-katalon-studio'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/basic-report-plugin-is-not-visible-in-katalon-studio/57823')

'step 2: Add visual checkpoint at Page_t_basic-report-plugin-is-not-visible-in-katalon-studio'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00144_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
