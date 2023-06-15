import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_performance-testing-katalon-octoperf'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/performance-testing-katalon-octoperf')

'step 2: Add visual checkpoint at Page_resources-center_blog_performance-testing-katalon-octoperf'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00156_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()