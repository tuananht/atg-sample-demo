import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-is-unable-to-find-the-element-located-by-xpath-pls-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-is-unable-to-find-the-element-located-by-xpath-pls-help/20045/6')

'step 2: Add visual checkpoint at Page_t_katalon-is-unable-to-find-the-element-located-by-xpath-pls-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01178_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
