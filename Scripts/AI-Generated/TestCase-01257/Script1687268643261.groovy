import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_this-element-neither-has-attached-source-nor-attached-javadoc-and-hence-no-javadoc-could-be-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/this-element-neither-has-attached-source-nor-attached-javadoc-and-hence-no-javadoc-could-be-found/42487/3')

'step 2: Add visual checkpoint at Page_t_this-element-neither-has-attached-source-nor-attached-javadoc-and-hence-no-javadoc-could-be-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01257_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
