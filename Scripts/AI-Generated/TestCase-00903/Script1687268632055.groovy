import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_webui-keywords-that-select-web-elements-by-css-class-names'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/webui-keywords-that-select-web-elements-by-css-class-names/50035')

'step 2: Add visual checkpoint at Page_t_webui-keywords-that-select-web-elements-by-css-class-names'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00903_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
